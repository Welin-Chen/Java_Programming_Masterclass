public class SearchTree implements NodeList {
    private ListItem root;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    private void performRemoval(ListItem item, ListItem parent) {
        if (item.next() == null) {
            // 刪除節點的右子樹為空
            if (parent.next() == item) {
                // 父層的右子樹節點為要刪除項目，父層右子樹連結到刪除節點的左子樹
                parent.setNext(item.previous());
            } else if (parent.previous() == item) {
                // 父層的左子樹節點為要刪除項目，父層左子樹連結到刪除節點的左子樹
                parent.setPrevious(item.previous());
            } else {
                // 根為刪除節點，設根為刪除節點的左子樹節點
                this.root = item.previous();
            }
        } else if (item.previous() == null) {
            // 刪除節點的左子樹為空
            if (parent.next() == item) {
                // 父層的右子樹節點為要刪除項目，父層右子樹連結到刪除節點的右子樹
                parent.setNext(item.next());
            } else if (parent.previous() == item) {
                // 父層的左子樹節點為要刪除項目，父層左子樹連結到刪除節點的右子樹
                parent.setPrevious(item.next());
            } else {
                // 根為刪除節點，設根為刪除節點的右子樹節點
                this.root = item.next();
            }
        } else {
            // current為要刪除節點的右子樹
            // leftmostParent為刪除節點
            ListItem current = item.next();
            ListItem leftmostParent = item;
            while (current.previous() != null) {
                // 找要刪除節點的右子樹中最左邊的節點
                leftmostParent = current;
                current = current.previous();
            }
            // item由current取代
            item.setValue(current.getValue());
            if (leftmostParent == item) {
                // item右子樹連結到current的右子樹
                item.setNext(current.next());
            } else {
                // 最左邊的節點的左子樹連結到current的右子樹
                leftmostParent.setPrevious(current.next());
            }
        }
    }

    public ListItem getRoot() {
        return root;
    }

    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if (comparison < 0) {
                // newItem should be in right tree(current<new)
                if (currentItem.next() != null) {
                    // current right child exist, current node move to right node
                    currentItem = currentItem.next();
                } else {
                    // current right child is null, newItem become right child
                    currentItem.setNext(newItem);
                    return true;
                }
            } else if (comparison > 0) {
                // newItem should be in left tree(current>new)
                if (currentItem.previous() != null) {
                    // current left child exist, current node move to left node
                    currentItem = currentItem.previous();
                } else {
                    // current left child is null, newItem become left child
                    currentItem.setPrevious(newItem);
                    return true;
                }
            } else {
                // current equal to newItem, node is already exist, not added
                System.out.println(newItem.getValue() + " is already present, not added");
                return false;
            }
        }
        return false;
    }

    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }
        // current=parent=root
        ListItem currentItem = this.root;
        ListItem parentItem = currentItem;

        while (currentItem != null) {
            int comparison = (currentItem.compareTo(item));
            if (comparison < 0) {
                // new>current: go to right tree(until found or to the end)
                parentItem = currentItem;
                currentItem = currentItem.next();
            } else if (comparison > 0) {
                // new<current: go to left tree(until found or to the end)
                parentItem = currentItem;
                currentItem = currentItem.previous();
            } else {
                // new=current, found the newItem in the tree, and delete it
                performRemoval(currentItem, parentItem);
                return true;
            }
        }
        // not found newItem in the tree, no delete
        return false;
    }

    public void traverse(ListItem root) {
        if (root != null) {
            // in order traversal(left->node->right)
            // got to root left child
            traverse(root.previous());
            // if most left child is null, then output current node value
            System.out.println(root.getValue());
            // go to root right child
            traverse(root.next());
        }
    }
}