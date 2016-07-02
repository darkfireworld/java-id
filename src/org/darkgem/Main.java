package org.darkgem;

/**
 * Created by Administrator on 2016/5/19.
 */
public class Main {
    static public void main(String[] args) {

        IdIo idIo = new IdIo();
        for (int i = 0; i < 1000; ++i) {
            System.out.println(idIo.nextSnowflakeId());
            System.out.println(idIo.nextEncodeUUID());
            System.out.println(idIo.nextUUID());
        }
    }
}
