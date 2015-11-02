/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceOrderDependencyRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ServiceOrderDependencyRequestMethod implements UdtMethod {
  private String method = null;
  private ServiceOrderDependencyRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ServiceOrderDependencyCreate method */
  public static final ServiceOrderDependencyRequestMethod SERVICE_ORDER_DEPENDENCY_CREATE = new ServiceOrderDependencyRequestMethod("ServiceOrderDependencyCreate");
  /** Variable representing the ServiceOrderDependencyEval method */
  public static final ServiceOrderDependencyRequestMethod SERVICE_ORDER_DEPENDENCY_EVAL = new ServiceOrderDependencyRequestMethod("ServiceOrderDependencyEval");
  /** Variable representing the ServiceOrderDependencyFind method */
  public static final ServiceOrderDependencyRequestMethod SERVICE_ORDER_DEPENDENCY_FIND = new ServiceOrderDependencyRequestMethod("ServiceOrderDependencyFind");
  /** Variable representing the ServiceOrderDependencyFindDependent method */
  public static final ServiceOrderDependencyRequestMethod SERVICE_ORDER_DEPENDENCY_FIND_DEPENDENT = new ServiceOrderDependencyRequestMethod("ServiceOrderDependencyFindDependent");
  /** Variable representing the ServiceOrderDependencyGet method */
  public static final ServiceOrderDependencyRequestMethod SERVICE_ORDER_DEPENDENCY_GET = new ServiceOrderDependencyRequestMethod("ServiceOrderDependencyGet");
}
