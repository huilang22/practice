/*
 * Generated code DO NOT EDIT
 * Generated file: ConnectReasonFindBulkUdtTemplateItem.java
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
 * Class used to create a ConnectReasonFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ConnectReasonFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ConnectReasonObjectFilter CRFindIn;
/**
 *
 * Constructor to create a  ConnectReasonFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ConnectReasonFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ConnectReasonObjectFilter CRFindInIn) {
    super(id, context, "ConnectReasonFind");
    CRFindIn = CRFindInIn;
  }

  public void translateToMap() {
    if (CRFindIn != null) {
      Integer index =  CRFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ConnectReason", ConnectReasonObjectHelper.toMap(CRFindIn, new HashMap(), "ConnectReason").get("ConnectReason"));
    }
  }


/**
 *
 * Sets the ConnectReason
 * @param CRFindInIn Value of the CRFindIn
 *
 */

  public void setConnectReason(ConnectReasonObjectFilter CRFindInIn) {
    CRFindIn = CRFindInIn;
  }

  public void translateFromMap() {
    CRFindIn = ConnectReasonObjectHelper.fromMapFilter(inputMap, "ConnectReason");
  }

/**
 *
 * Gets the ConnectReason
 * @return Value of the ConnectReason
 *
 */

  public ConnectReasonObjectFilter getConnectReason( ) {
    return CRFindIn;
  }

}
