package cn.kavier.canal.adapter;

/**
 * es adapter lifecycle
 *
 * @author joey 2022-07-09
 */
public interface Adapter {

    void start();

    void etl();

    void destroy();

}
