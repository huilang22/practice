/*
 * Generated code DO NOT EDIT
 * Generated file: ConnectReasonGetBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a ConnectReasonGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ConnectReasonGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ConnectReasonObjectKeyData CRGetIn;
/**
 *
 * Constructor to create a  ConnectReasonGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ConnectReasonGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ConnectReasonObjectKeyData CRGetInIn) {
    super(id, context, "ConnectReasonGet");
    CRGetIn = CRGetInIn;
  }

  public void translateToMap() {
    if (CRGetIn != null) {
      CRGetIn.resetFlags(true, true);
      addInput("ConnectReason", ConnectReasonObjectKeyHelper.toMap(CRGetIn, new HashMap(), "ConnectReasonObjectKeyData").get("ConnectReasonObjectKeyData"));
    }
  }


/**
 *
 * Sets the ConnectReason
 * @param CRGetInIn Value of the CRGetIn
 *
 */

  public void setConnectReason(ConnectReasonObjectKeyData CRGetInIn) {
    CRGetIn = CRGetInIn;
  }

  public void translateFromMap() {
    CRGetIn = ConnectReasonObjectKeyHelper.fromMap(inputMap, "ConnectReason");
  }

/**
 *
 * Gets the ConnectReason
 * @return Value of the ConnectReason
 *
 */

  public ConnectReasonObjectKeyData getConnectReason( ) {
    return CRGetIn;
  }

}
