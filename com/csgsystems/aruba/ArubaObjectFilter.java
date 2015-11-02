package com.csgsystems.aruba;

import java.io.Serializable;

import com.csgsystems.bali.BaliObjectFilter;

/**
 * Copyright &copy; 2006 Comverse, Inc.  All rights reserved.
 * This media contains unpublished, confidential, and proprietary
 * information of Comverse, Inc.  No disclosure or use of any
 * portion of the contents of these materials may be made without
 * the express written consent of Comverse, Inc.
 */
/** abstract base class for Aruba Filter objects */
public abstract class ArubaObjectFilter implements BaliObjectFilter, Serializable
{
  protected Integer index     = null;
  protected Integer blockSize = null;

  /** get this filter's Index offset
   * @return Integer the Index
   */
  public Integer getIndex()
  {
    return this.index;
  }
  /** set this filter's Index offset
   * @param index the new Index
   */
  public void setIndex(Integer index)
  {
    this.index = index;
  }
  
  /** get this filter's BlockSize
   * @return Integer this filter's BlockSize
   */
  public Integer getBlockSize()
  {
    return this.blockSize;
  }
  /** set this filter's BlockSize
   * @param blockSize the new BlockSize
   */
  public void setBlockSize(Integer blockSize)
  {
    this.blockSize = blockSize;
  }
}
