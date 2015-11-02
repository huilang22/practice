package com.csgsystems.aruba;

import java.security.Principal;

/**
 * Copyright &copy; 2006 Comverse, Inc.  All rights reserved.
 * This media contains unpublished, confidential, and proprietary
 * information of Comverse, Inc.  No disclosure or use of any
 * portion of the contents of these materials may be made without
 * the express written consent of Comverse, Inc.
 */
public class ArubaPrincipal implements Principal
{
  private String name = null;

  public ArubaPrincipal(String name)
  {
    super();
    this.name = name;
  }

  /**
   * @see java.security.Principal#getName()
   */
  public String getName()
  {
    return name;
  }

}
