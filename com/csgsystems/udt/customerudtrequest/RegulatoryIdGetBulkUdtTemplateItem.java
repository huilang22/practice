/*
 * Generated code DO NOT EDIT
 * Generated file: RegulatoryIdGetBulkUdtTemplateItem.java
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
 * Class used to create a RegulatoryIdGetBulkUdtTemplateItem Bulk Template
 *
 */

public class RegulatoryIdGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RegulatoryIdObjectKeyData RIGetIn;
/**
 *
 * Constructor to create a  RegulatoryIdGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RegulatoryIdGetBulkUdtTemplateItem(String id, BSDMSessionContext context, RegulatoryIdObjectKeyData RIGetInIn) {
    super(id, context, "RegulatoryIdGet");
    RIGetIn = RIGetInIn;
  }

  public void translateToMap() {
    if (RIGetIn != null) {
      RIGetIn.resetFlags(true, true);
      addInput("RegulatoryId", RegulatoryIdObjectKeyHelper.toMap(RIGetIn, new HashMap(), "RegulatoryIdObjectKeyData").get("RegulatoryIdObjectKeyData"));
    }
  }


/**
 *
 * Sets the RegulatoryId
 * @param RIGetInIn Value of the RIGetIn
 *
 */

  public void setRegulatoryId(RegulatoryIdObjectKeyData RIGetInIn) {
    RIGetIn = RIGetInIn;
  }

  public void translateFromMap() {
    RIGetIn = RegulatoryIdObjectKeyHelper.fromMap(inputMap, "RegulatoryId");
  }

/**
 *
 * Gets the RegulatoryId
 * @return Value of the RegulatoryId
 *
 */

  public RegulatoryIdObjectKeyData getRegulatoryId( ) {
    return RIGetIn;
  }

}
