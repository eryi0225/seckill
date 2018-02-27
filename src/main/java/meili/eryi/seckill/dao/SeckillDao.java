package meili.eryi.seckill.dao;

import java.util.Date;

//有关SeckillDao层接口
public interface SeckillDao {

    /**
     * 减库存
     * @param seckillId
     * @param killTime
     * @return
     */
    int reduceNumber(long seckillId,Date killTime);
}
