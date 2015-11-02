/*
 * Generated code DO NOT EDIT
 * Generated file: InvsTypeEquipTxnAssocRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsTypeEquipTxnAssocRequestMethod implements UdtMethod {
  private String method = null;
  private InvsTypeEquipTxnAssocRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsTypeEquipTxnAssocCreate method */
  public static final InvsTypeEquipTxnAssocRequestMethod INVS_TYPE_EQUIP_TXN_ASSOC_CREATE = new InvsTypeEquipTxnAssocRequestMethod("InvsTypeEquipTxnAssocCreate");
  /** Variable representing the InvsTypeEquipTxnAssocDelete method */
  public static final InvsTypeEquipTxnAssocRequestMethod INVS_TYPE_EQUIP_TXN_ASSOC_DELETE = new InvsTypeEquipTxnAssocRequestMethod("InvsTypeEquipTxnAssocDelete");
  /** Variable representing the InvsTypeEquipTxnAssocFind method */
  public static final InvsTypeEquipTxnAssocRequestMethod INVS_TYPE_EQUIP_TXN_ASSOC_FIND = new InvsTypeEquipTxnAssocRequestMethod("InvsTypeEquipTxnAssocFind");
  /** Variable representing the InvsTypeEquipTxnAssocFindcommontxn method */
  public static final InvsTypeEquipTxnAssocRequestMethod INVS_TYPE_EQUIP_TXN_ASSOC_FINDCOMMONTXN = new InvsTypeEquipTxnAssocRequestMethod("InvsTypeEquipTxnAssocFindcommontxn");
  /** Variable representing the InvsTypeEquipTxnAssocGet method */
  public static final InvsTypeEquipTxnAssocRequestMethod INVS_TYPE_EQUIP_TXN_ASSOC_GET = new InvsTypeEquipTxnAssocRequestMethod("InvsTypeEquipTxnAssocGet");
}
