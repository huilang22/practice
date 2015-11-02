/*
 * Generated code DO NOT EDIT
 * Generated file: InvdViewsRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvdViewsRequestMethod implements UdtMethod {
  private String method = null;
  private InvdViewsRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvdViewsCreate method */
  public static final InvdViewsRequestMethod INVD_VIEWS_CREATE = new InvdViewsRequestMethod("InvdViewsCreate");
  /** Variable representing the InvdViewsDelete method */
  public static final InvdViewsRequestMethod INVD_VIEWS_DELETE = new InvdViewsRequestMethod("InvdViewsDelete");
  /** Variable representing the InvdViewsFind method */
  public static final InvdViewsRequestMethod INVD_VIEWS_FIND = new InvdViewsRequestMethod("InvdViewsFind");
  /** Variable representing the InvdViewsGet method */
  public static final InvdViewsRequestMethod INVD_VIEWS_GET = new InvdViewsRequestMethod("InvdViewsGet");
  /** Variable representing the InvdViewsGetLatest method */
  public static final InvdViewsRequestMethod INVD_VIEWS_GET_LATEST = new InvdViewsRequestMethod("InvdViewsGetLatest");
  /** Variable representing the InvdViewsUpdate method */
  public static final InvdViewsRequestMethod INVD_VIEWS_UPDATE = new InvdViewsRequestMethod("InvdViewsUpdate");
}
