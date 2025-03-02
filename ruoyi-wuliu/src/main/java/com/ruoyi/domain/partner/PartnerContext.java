package com.ruoyi.domain.partner;

import com.ruoyi.domain.base.AddressInfo;
import com.ruoyi.domain.base.PersonInfo;

/**
 * 承运商决策上下文
 */
public class PartnerContext {
    /**
     * 寄件人信息
     */
    private PersonInfo  serder;

    /**
     * 收件人信息
     */
    private PersonInfo  receiver;

    /**
     * 寄件人地址
     */
   private AddressInfo senderAddr;

    /**
     * 收件人地址
     */
   private AddressInfo receiverAddr;

    public PersonInfo getSerder() {
        return serder;
    }

    public void setSerder(PersonInfo serder) {
        this.serder = serder;
    }

    public PersonInfo getReceiver() {
        return receiver;
    }

    public void setReceiver(PersonInfo receiver) {
        this.receiver = receiver;
    }

    public AddressInfo getSenderAddr() {
        return senderAddr;
    }

    public void setSenderAddr(AddressInfo senderAddr) {
        this.senderAddr = senderAddr;
    }

    public AddressInfo getReceiverAddr() {
        return receiverAddr;
    }

    public void setReceiverAddr(AddressInfo receiverAddr) {
        this.receiverAddr = receiverAddr;
    }
}
