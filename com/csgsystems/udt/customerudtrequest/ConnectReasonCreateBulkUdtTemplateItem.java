/*
 * Generated code DO NOT EDIT
 * Generated file: ConnectReasonCreateBulkUdtTemplateItem.java
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
 * Class used to create a ConnectReasonCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ConnectReasonCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ConnectReasonObjectData CRCreateIn;
/**
 *
 * Constructor to create a  ConnectReasonCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ConnectReasonCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ConnectReasonObjectData CRCreateInIn) {
    super(id, context, "ConnectReasonCreate");
    CRCreateIn = CRCreateInIn;
  }

  public void translateToMap() {
    if (CRCreateIn != null) {
      CRCreateIn.resetFlags(true, true);
      addInput("ConnectReason", ConnectReasonObjectHelper.toMap(CRCreateIn, new HashMap(), "ConnectReason").get("ConnectReason"));
    }
  }


/**
 *
 * Sets the ConnectReason
 * @param CRCreateInIn Value of the CRCreateIn
 *
 */

  public void setConnectReason(ConnectReasonObjectData CRCreateInIn) {
    CRCreateIn = CRCreateInIn;
  }

  public void translateFromMap() {
    CRCreateIn = ConnectReasonObjectHelper.fromMap(inputMap, "ConnectReason");
  }

/**
 *
 * Gets the ConnectReason
 * @return Value of the ConnectReason
 *
 */

  public ConnectReasonObjectData getConnectReason( ) {
    return CRCreateIn;
  }

}
