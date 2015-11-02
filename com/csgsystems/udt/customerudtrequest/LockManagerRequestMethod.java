/*
 * Generated code DO NOT EDIT
 * Generated file: LockManagerRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class LockManagerRequestMethod implements UdtMethod {
  private String method = null;
  private LockManagerRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the AccountLockCreate method */
  public static final LockManagerRequestMethod ACCOUNT_LOCK_CREATE = new LockManagerRequestMethod("AccountLockCreate");
  /** Variable representing the AccountLockFind method */
  public static final LockManagerRequestMethod ACCOUNT_LOCK_FIND = new LockManagerRequestMethod("AccountLockFind");
  /** Variable representing the ServiceLockCreate method */
  public static final LockManagerRequestMethod SERVICE_LOCK_CREATE = new LockManagerRequestMethod("ServiceLockCreate");
  /** Variable representing the ServiceLockFind method */
  public static final LockManagerRequestMethod SERVICE_LOCK_FIND = new LockManagerRequestMethod("ServiceLockFind");
}
