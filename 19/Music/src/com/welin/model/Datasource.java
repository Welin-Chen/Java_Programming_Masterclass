package com.welin.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Datasource {
    public static final String DB_NAME = "music.db";

    public static final String CONNECTION_STRING = "jdbc:sqlite:/Users/chenweilin/Desktop/java/19/Music/" + DB_NAME;
//    public static final String CONNECTION_STRING = "jdbc:sqlite:/Users/chenweilin/Desktop/java/19/TestDB/" + DB_NAME;

    public static final String TABLE_ALBUMS = "albums";
    public static final String COLUMN_ALBUM_ID = "_id";
    public static final String COLUMN_ALBUM_NAME = "name";
    public static final String COLUMN_ALBUM_ARTIST = "artist";
    public static final int INDEX_ALBUM_ID = 1;
    public static final int INDEX_ALBUM_NAME = 2;
    public static final int INDEX_ALBUM_ARTIST = 3;

    public static final String TABLE_ARTISTS = "artists";
    public static final String COLUMN_ARTIST_ID = "_id";
    public static final String COLUMN_ARTIST_NAME = "name";
    public static final int INDEX_ARTIST_ID = 1;
    public static final int INDEX_ARTIST_NAME = 2;


    public static final String TABLE_SONGS = "songs";
    public static final String COLUMN_SONGS_ID = "_id";
    public static final String COLUMN_SONGS_TRACK = "track";
    public static final String COLUMN_SONGS_TITLE = "title";
    public static final String COLUMN_SONGS_ALBUM = "album";
    public static final int INDEX_SONGS_ID = 1;
    public static final int INDEX_SONGS_TRACK = 2;
    public static final int INDEX_SONGS_TITLE = 3;
    public static final int INDEX_SONGS_ALBUM = 4;

    public static final int ORDER_BY_NONE = 1;
    public static final int ORDER_BY_ASC = 2;
    public static final int ORDER_BY_DESC = 3;

    //SELECT albums.name FROM albums INNER JOIN  artists  ON albums.artist=artists._id WHERE artists.name="Iron Maiden" ORDER BY albums.name COLLATE NOCASE ASC
    public static final String QUERY_ALBUMS_BY_ARTIST_START =
            "SELECT " + TABLE_ALBUMS + "." + COLUMN_ALBUM_NAME + " FROM " + TABLE_ALBUMS + " INNER JOIN " +
                    TABLE_ARTISTS + " ON " + TABLE_ALBUMS + "." + COLUMN_ALBUM_ARTIST + "=" + TABLE_ARTISTS + "." + COLUMN_ARTIST_ID +
                    " WHERE " + TABLE_ARTISTS + "." + COLUMN_ARTIST_NAME + "=" + "\"";
    public static final String QUERY_ALBUMS_ARTIST_SORT =
            " ORDER BY " + TABLE_ALBUMS + "." + COLUMN_ALBUM_NAME + " COLLATE NOCASE ";

//    SELECT artists.name, albums.name, songs.track FROM songs
//    INNER JOIN albums ON songs.album=albums._id
//    INNER JOIN artists ON albums.artist=artists._id
//    WHERE songs.title="Go Your Own Way"
//    ORDER BY artists.name, albums.name COLLATE NOCASE ASC

    public static final String QUERY_ARTIST_BY_SONG_START =
            "SELECT " + TABLE_ARTISTS + "." + COLUMN_ARTIST_NAME + ", " +
                    TABLE_ALBUMS + "." + COLUMN_ARTIST_NAME + ", " +
                    TABLE_SONGS + "." + COLUMN_SONGS_TRACK + " FROM " + TABLE_SONGS +
                    " INNER JOIN " + TABLE_ALBUMS + " ON " +
                    TABLE_SONGS + "." + COLUMN_SONGS_ALBUM + "=" + TABLE_ALBUMS + "." + COLUMN_ALBUM_ID +
                    " INNER JOIN " + TABLE_ARTISTS + " ON " +
                    TABLE_ALBUMS + "." + COLUMN_ALBUM_ARTIST + "=" + TABLE_ARTISTS + "." + COLUMN_ARTIST_ID +
                    " WHERE " + TABLE_SONGS + "." + COLUMN_SONGS_TITLE + "=\"";

    public static final String QUERY_ARTIST_BY_SONG_SORT =
            " ORDER BY " + TABLE_ARTISTS + "." + COLUMN_ARTIST_NAME + ", " +
                    TABLE_ALBUMS + "." + COLUMN_ALBUM_NAME + " COLLATE NOCASE ";

//    CREATE VIEW iF NOT EXISTS artist_list  AS SELECT artists.name, albums.name AS album,
//    songs.track, songs.title FROM songs
//    INNER JOIN albums ON songs.album=albums._id
//    INNER JOIN artists ON albums.artist=artists._id
//    ORDER BY artists.name, albums.name, songs.track

    public static final String TABLE_ARTIST_SONG_VIEW = "artist_list";
    public static final String CREATE_ARTIST_FOR_SONG_VIEW = "CREATE VIEW IF NOT EXISTS " +
            TABLE_ARTIST_SONG_VIEW + " AS SELECT " + TABLE_ARTISTS + "." + COLUMN_ARTIST_NAME + ", " +
            TABLE_ALBUMS + "." + COLUMN_ALBUM_NAME + " AS " + COLUMN_SONGS_ALBUM + ", " +
            TABLE_SONGS + "." + COLUMN_SONGS_TRACK + ", " + TABLE_SONGS + "." + COLUMN_SONGS_TITLE +
            " FROM " + TABLE_SONGS +
            " INNER JOIN " + TABLE_ALBUMS + " ON " + TABLE_SONGS + "." + COLUMN_SONGS_ALBUM + "=" + TABLE_ALBUMS + "." + COLUMN_ALBUM_ID +
            " INNER JOIN " + TABLE_ARTISTS + " ON " + TABLE_ALBUMS + "." + COLUMN_ALBUM_ARTIST + "=" + TABLE_ARTISTS + "." + COLUMN_ARTIST_ID +
            " ORDER BY " + TABLE_ARTISTS + "." + COLUMN_ARTIST_NAME + ", " + TABLE_ALBUMS + "." + COLUMN_ALBUM_NAME + ", " + TABLE_SONGS + "." + COLUMN_SONGS_TRACK;

//    SELECT name,album,track FROM artist_list WHERE title="Go Your Own Way"

    public static final String QUERY_VIEW_SONG_INFO = "SELECT " + COLUMN_ARTIST_NAME + "," +
            COLUMN_SONGS_ALBUM + "," + COLUMN_SONGS_TRACK + " FROM " + TABLE_ARTIST_SONG_VIEW +
            " WHERE " + COLUMN_SONGS_TITLE + "=\"";

    public static final String QUERY_VIEW_SONG_INFO_PREP = "SELECT " + COLUMN_ARTIST_NAME + "," +
            COLUMN_SONGS_ALBUM + "," + COLUMN_SONGS_TRACK + " FROM " + TABLE_ARTIST_SONG_VIEW +
            " WHERE " + COLUMN_SONGS_TITLE + "=?";

//    SELECT name,album,track FROM artist_list WHERE title=?

    public static final String INSERT_ARTIST = "INSERT INTO " + TABLE_ARTISTS +
            '(' + COLUMN_ARTIST_NAME + ") VALUES(?)";
    public static final String INSERT_ALBUMS = "INSERT INTO " + TABLE_ALBUMS +
            '(' + COLUMN_ALBUM_NAME + "," + COLUMN_ALBUM_ARTIST + ") VALUES(?,?)";
    public static final String INSERT_SONGS = "INSERT INTO " + TABLE_SONGS +
            '(' + COLUMN_SONGS_TRACK + "," + COLUMN_SONGS_TITLE + "," + COLUMN_SONGS_ALBUM +
            ") VALUES(?,?,?)";

    public static final String QUERY_ARTIST = "SELECT " + COLUMN_ARTIST_ID + " FROM " +
            TABLE_ARTISTS + " WHERE " + COLUMN_ARTIST_NAME + "=?";
    public static final String QUERY_ALBUM = "SELECT " + COLUMN_ALBUM_ID + " FROM " +
            TABLE_ALBUMS + " WHERE " + COLUMN_ALBUM_NAME + "=?";


    private Connection conn;

    private PreparedStatement insertIntoArtists;
    private PreparedStatement insertIntoAlbums;
    private PreparedStatement insertIntoSongs;

    private PreparedStatement queryArtist;
    private PreparedStatement queryAlbum;

    private PreparedStatement querySongInfoView;

    public boolean open() {
        try {
            conn = DriverManager.getConnection(CONNECTION_STRING);
            querySongInfoView = conn.prepareStatement(QUERY_VIEW_SONG_INFO_PREP);

            insertIntoArtists = conn.prepareStatement(INSERT_ARTIST, Statement.RETURN_GENERATED_KEYS);
            insertIntoAlbums = conn.prepareStatement(INSERT_ALBUMS, Statement.RETURN_GENERATED_KEYS);
            insertIntoSongs = conn.prepareStatement(INSERT_SONGS, Statement.RETURN_GENERATED_KEYS);

            queryArtist = conn.prepareStatement(QUERY_ARTIST);
            queryAlbum = conn.prepareStatement(QUERY_ALBUM);

            return true;
        } catch (SQLException throwables) {
            System.out.println("Couldn't connect to database: " + throwables.getMessage());
            throwables.printStackTrace();
            return false;
        }
    }

    public void close() {
        try {
            if (querySongInfoView != null) {
                querySongInfoView.close();
            }

            if (insertIntoArtists != null) {
                insertIntoArtists.close();
            }

            if (insertIntoAlbums != null) {
                insertIntoAlbums.close();
            }

            if (insertIntoSongs != null) {
                insertIntoSongs.close();
            }

            if (queryArtist != null) {
                queryArtist.close();
            }

            if (queryAlbum != null) {
                queryAlbum.close();
            }

            if (conn != null) {
                conn.close();
            }
        } catch (SQLException throwables) {
            System.out.println("Couldn't close connection: " + throwables.getMessage());
            throwables.printStackTrace();
        }
    }

    public List<Artist> queryArtists(int sortOrder) {

        StringBuilder sb = new StringBuilder("SELECT * FROM ");
        sb.append(TABLE_ARTISTS);
        if (sortOrder != ORDER_BY_NONE) {
            sb.append(" ORDER BY ");
            sb.append(COLUMN_ARTIST_NAME);
            sb.append(" COLLATE NOCASE ");
            if (sortOrder == ORDER_BY_DESC) {
                sb.append("DESC");
            } else {
                sb.append("ASC");
            }
        }

        try (Statement statement = conn.createStatement();
             ResultSet results = statement.executeQuery(sb.toString())) {

            List<Artist> artists = new ArrayList<>();
            while (results.next()) {
                Artist artist = new Artist();
                artist.setId(results.getInt(INDEX_ARTIST_ID));
                artist.setName(results.getString(INDEX_ARTIST_NAME));
                artists.add(artist);
            }
            return artists;
        } catch (SQLException throwables) {
            System.out.println("Query failed: " + throwables.getMessage());
            throwables.printStackTrace();
            return null;
        }
    }

    public List<String> queryAlbumsForArtist(String artistName, int sortOrder) {
//SELECT albums.name FROM albums INNER JOIN  artists  ON albums.artist=artists._id WHERE artists.name="Iron Maiden" ORDER BY albums.name COLLATE NOCASE ASC
        StringBuilder sb = new StringBuilder(QUERY_ALBUMS_BY_ARTIST_START);
        sb.append(artistName);
        sb.append("\" ");

        if (sortOrder != ORDER_BY_NONE) {
            sb.append(QUERY_ALBUMS_ARTIST_SORT);
            if (sortOrder == ORDER_BY_DESC)
                sb.append("DESC");
            else {
                sb.append("ASC");
            }
        }

        System.out.println("SQL statement = " + sb.toString());

        try (Statement statement = conn.createStatement();
             ResultSet results = statement.executeQuery(sb.toString())) {

            List<String> albums = new ArrayList<>();
            while (results.next()) {
                albums.add(results.getString(1));
            }
            return albums;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("Query failed: " + throwables.getMessage());
            return null;
        }
    }

    public List<SongArtist> queryArtistForSong(String songName, int sortOrder) {

        StringBuilder sb = new StringBuilder(QUERY_ARTIST_BY_SONG_START);
        sb.append(songName);
        sb.append("\"");

        if (sortOrder != ORDER_BY_NONE) {
            sb.append(QUERY_ARTIST_BY_SONG_SORT);
            if (sortOrder == ORDER_BY_DESC) {
                sb.append("DESC");
            } else {
                sb.append("ASC");
            }
        }

        System.out.println("SQL Statement: " + sb.toString());

        try (Statement statement = conn.createStatement();
             ResultSet results = statement.executeQuery(sb.toString())) {

            List<SongArtist> songArtists = new ArrayList<>();

            while (results.next()) {
                SongArtist songArtist = new SongArtist();
                songArtist.setArtistName(results.getString(1));
                songArtist.setAlbumName(results.getString(2));
                songArtist.setTrack(results.getInt(3));
                songArtists.add(songArtist);
            }
            return songArtists;
        } catch (SQLException throwables) {
            System.out.println("Query failed: " + throwables.getMessage());
            return null;
        }
    }

    public void querySongsMetadata() {
        String sql = "SELECT * FROM " + TABLE_SONGS;

        try (Statement statement = conn.createStatement();
             ResultSet results = statement.executeQuery(sql)) {

            ResultSetMetaData meta = results.getMetaData();
            int numColumns = meta.getColumnCount();
            for (int i = 1; i <= numColumns; i++) {
                System.out.format("Column %d in the songs table is names %s\n", i, meta.getColumnName(i));
            }
        } catch (SQLException e) {
            System.out.println("Query failed: " + e.getMessage());
        }
    }

    public int getCount(String table) {
        String sql = "SELECT COUNT(*),MIN(_id) FROM " + table;
        try (Statement statement = conn.createStatement();
             ResultSet results = statement.executeQuery(sql)) {

            int count = results.getInt(1);
            int min = results.getInt(2);

            System.out.format("Count = %d, Min = %d\n", count, min);
            return count;
        } catch (SQLException e) {
            System.out.println("Qurey failed: " + e.getMessage());
            return -1;
        }
    }

    public boolean createViewForSongArtists() {
        try (Statement statement = conn.createStatement()) {

            System.out.println(CREATE_ARTIST_FOR_SONG_VIEW);
            statement.execute(CREATE_ARTIST_FOR_SONG_VIEW);
            return true;
        } catch (SQLException e) {
            System.out.println("Create View failed: " + e.getMessage());
            return false;
        }
    }

    public List<SongArtist> querySongInfoView(String title) {

        try {
            querySongInfoView.setString(1, title);
            ResultSet results = querySongInfoView.executeQuery();

            List<SongArtist> songArtists = new ArrayList<>();
            while (results.next()) {
                SongArtist songArtist = new SongArtist();
                songArtist.setArtistName(results.getString(1));
                songArtist.setAlbumName(results.getString(2));
                songArtist.setTrack(results.getInt(3));
                songArtists.add(songArtist);
            }

            return songArtists;
        } catch (SQLException e) {
            System.out.println("Query failed: " + e.getMessage());
            return null;
        }
    }

    private int insertArtist(String name) throws SQLException {

        queryArtist.setString(1, name);
        ResultSet results = queryArtist.executeQuery();
        if (results.next()) {
            return results.getInt(1);
        } else {
            insertIntoArtists.setString(1, name);
            int affectedRows = insertIntoArtists.executeUpdate();

            if (affectedRows != 1) {
                throw new SQLException("Couldn't insert artist!");
            }

            ResultSet generatedKeys = insertIntoArtists.getGeneratedKeys();
            if (generatedKeys.next()) {
                return generatedKeys.getInt(1);
            } else {
                throw new SQLException("Couldn't get _id for artist");
            }
        }
    }

    private int insertAlbum(String name, int artistId) throws SQLException {

        queryAlbum.setString(1, name);
        ResultSet results = queryAlbum.executeQuery();
        if (results.next()) {
            return results.getInt(1);
        } else {
            insertIntoAlbums.setString(1, name);
            insertIntoAlbums.setInt(2, artistId);
            int affectedRows = insertIntoAlbums.executeUpdate();

            if (affectedRows != 1) {
                throw new SQLException("Couldn't insert album!");
            }

            ResultSet generatedKeys = insertIntoAlbums.getGeneratedKeys();
            if (generatedKeys.next()) {
                return generatedKeys.getInt(1);
            } else {
                throw new SQLException("Couldn't get _id for album");
            }
        }
    }

    public void insertSong(String title, String artist, String album, int track) {

        try {
            conn.setAutoCommit(false);

            int artistId = insertArtist(artist);
            int albumId = insertAlbum(album, artistId);
            insertIntoSongs.setInt(1, track);
            insertIntoSongs.setString(2, title);
            insertIntoSongs.setInt(3, albumId);

            int affectedRows = insertIntoSongs.executeUpdate();

            if (affectedRows == 1) {
                conn.commit();
            } else {
                throw new SQLException("The song insert failed!");
            }
        } catch (Exception e) {
            System.out.println("Insert song exception: " + e.getMessage());
            try {
                System.out.println("Perform rollback");
                conn.rollback();
            } catch (SQLException e2) {
                System.out.println("Oh boy! Things are really bad! " + e2.getMessage());
            }
        } finally {
            try {
                System.out.println("Resetting default commit behavior");
                conn.setAutoCommit(true);
            } catch (SQLException e3) {
                System.out.println("Couldn't reset auto-commit! " + e3.getMessage());
            }
        }

    }
}
