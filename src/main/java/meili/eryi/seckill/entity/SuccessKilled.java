package meili.eryi.seckill.entity;

import java.util.Date;

public class SuccessKilled {
    private long seckill_id;

    private long userPhone;

    private short state;

    private Date createtime;

//    变通
//    多对一，复合属性，在我们秒杀的时候我们的一个商品对应的是多个秒杀成功的记录所以是需要一个多对一的操作
    private Seckill seckill;

    public long getSeckill_id() {
        return seckill_id;
    }

    public void setSeckill_id(long seckill_id) {
        this.seckill_id = seckill_id;
    }

    public long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(long userPhone) {
        this.userPhone = userPhone;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Seckill getSeckill() {
        return seckill;
    }

    public void setSeckill(Seckill seckill) {
        this.seckill = seckill;
    }
}
