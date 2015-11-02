/*
 * Generated code DO NOT EDIT
 * Generated file: RegulatoryIdCreateBulkUdtTemplateItem.java
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
 * Class used to create a RegulatoryIdCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class RegulatoryIdCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RegulatoryIdObjectData RICreateIn;
/**
 *
 * Constructor to create a  RegulatoryIdCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RegulatoryIdCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, RegulatoryIdObjectData RICreateInIn) {
    super(id, context, "RegulatoryIdCreate");
    RICreateIn = RICreateInIn;
  }

  public void translateToMap() {
    if (RICreateIn != null) {
      RICreateIn.resetFlags(true, true);
      addInput("RegulatoryId", RegulatoryIdObjectHelper.toMap(RICreateIn, new HashMap(), "RegulatoryId").get("RegulatoryId"));
    }
  }


/**
 *
 * Sets the RegulatoryId
 * @param RICreateInIn Value of the RICreateIn
 *
 */

  public void setRegulatoryId(RegulatoryIdObjectData RICreateInIn) {
    RICreateIn = RICreateInIn;
  }

  public void translateFromMap() {
    RICreateIn = RegulatoryIdObjectHelper.fromMap(inputMap, "RegulatoryId");
  }

/**
 *
 * Gets the RegulatoryId
 * @return Value of the RegulatoryId
 *
 */

  public RegulatoryIdObjectData getRegulatoryId( ) {
    return RICreateIn;
  }

}
