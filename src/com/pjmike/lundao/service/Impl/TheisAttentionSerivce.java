package com.pjmike.lundao.service.Impl;

public interface TheisAttentionSerivce {
    int AaginAttentioned(int id,int thesisid);
    Integer selectAttentioned(int id,int thesisid);
    int insertAttention(int id,int thesisid);
    int deleteAttention(int id,int thesisid);


}
