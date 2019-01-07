package com.littlezheng.arithmetic.ds;

public interface List<E> {

    /**
     * 添加指定元素
     * 
     * @param o  元素
     * @return   是否添加成功
     */
    boolean add(E o);
    
    /**
     * 删除指定元素
     * 
     * @param o  元素
     * @return   是否删除成功
     */
    boolean remove(E o);
    
    /**
     * 删除某个索引位置上的元素
     * 
     * @param index  索引
     * @return       是否删除成功
     */
    boolean remove(int index);
    
    /**
     * 获取某个索引位置上的元素
     * 
     * @param index  索引
     * @return       索引位置对应的元素，可能为null
     */
    E get(int index);
    
    /**
     * 查找指定元素位于集合中的索引
     * 
     * @param o  元素
     * @return   索引位置，为-1时表示没有找到
     */
    int indexOf(E o);
    
    /**
     * 返回集合大小
     * 
     * @return  集合大小
     */
    int size();
    
    /**
     * 判断集合是否为空
     * 
     * @return
     */
    boolean isEmpty();
    
    /**
     * 集合的迭代方法
     * 
     * @param consumer  消费者，通过Consumer的on回调得到当前迭代到的元素
     */
    void forEach(Consumer<E> consumer);
    
}
