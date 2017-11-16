import java.util.*;
import java.lang.*;
import java.io.*;

public class MST
{
    private static int p=5;

    int minimumKey(int key[], Boolean mst[])
    {
        int m = Integer.MAX_VALUE, mindex=-1;

        for (int i = 0; i < p; i++)
            if (mst[i] == false && key[i] < m)
            {
                m = key[i];
                mindex = i;
            }

        return mindex;
    }


    void showMST(int parent[], int n, int graph[][])
    {
        System.out.println("Edge   Weight");
        for (int i = 1; i < p; i++)
            System.out.println(parent[i]+" - "+ i+"    "+
                               graph[i][parent[i]]);
    }


    void prim(int graph[][])
    {
        int parent[] = new int[p];

        int key[] = new int [p];

        Boolean Set[] = new Boolean[p];

        for (int i = 0; i < p; i++)
        {
            key[i] = Integer.MAX_VALUE;
            Set[i] = false;
        }

        key[0] = 0;
        parent[0] = -1;

        for (int count = 0; count < p-1; count++)
        {

            int i = minimumKey(key, Set);

            Set[i] = true;

            for (int j = 0; j < p; j++)
                if (graph[i][j]!=0 && Set[j] == false &&
                    graph[i][j] <  key[j])
                {
                    parent[j]  = i;
                    key[j] = graph[i][j];
                }
        }
         showMST(parent, p, graph);
    }

     public static void main (String[] args)
    {
    Scanner sc = new Scanner(System.in);
    MST t = new MST();

    System.out.println("Enter Number of nodes");
    int nodes = sc.nextInt();
    int[][] graph = new int[nodes][nodes];

    System.out.println("Please enter array elements row by row");
        for (int i = 0; i < nodes; i++)
    {
        for (int j = 0; j < nodes; j++)
        {
         int value = sc.nextInt();
         graph[i][j] = value;
        }
    }

        t.prim(graph);
    }
}
