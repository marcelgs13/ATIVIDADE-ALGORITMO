package tree;
import java.util.ArrayList;
import java.util.List;
import estrut.Tree;

public class BinarySearchTree implements Tree{
    private Node root;

    private static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    @Override
    public boolean buscaElemento(int valor) {
        return buscaElementoRecursivamente(root, valor);
    }
    private boolean buscaElementoRecursivamente(Node root, int valor) {
        if (root == null)
            return false;

        if (valor == root.value)
            return true;

        if (valor < root.value)
            return buscaElementoRecursivamente(root.left, valor);
        else
            return buscaElementoRecursivamente(root.right, valor);
    }

    @Override
    public int minimo() {
        return 0;
    }

    @Override
    public int maximo() {
        return 0;
    }

    @Override
    public void insereElemento(int valor) {
        return;
    }

    @Override
    public void remove(int valor) {
        return;
    }

    @Override
    public int[] preOrdem() {
        return new int[]{1,2};
    }

    @Override
    public int[] emOrdem() {
        return new int[]{1,2};
    }

    @Override
    public int[] posOrdem() {
        return new int[]{1,2};
    }

}