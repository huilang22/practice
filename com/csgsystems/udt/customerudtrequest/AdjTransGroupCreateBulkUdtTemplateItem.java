/*
 * Generated code DO NOT EDIT
 * Generated file: AdjTransGroupCreateBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a AdjTransGroupCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class AdjTransGroupCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ATGObjectData ATGCreateIn;
/**
 *
 * Constructor to create a  AdjTransGroupCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AdjTransGroupCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ATGObjectData ATGCreateInIn) {
    super(id, context, "AdjTransGroupCreate");
    ATGCreateIn = ATGCreateInIn;
  }

  public void translateToMap() {
    if (ATGCreateIn != null) {
      ATGCreateIn.resetFlags(true, true);
      addInput("AdjTransGroup", ATGObjectHelper.toMap(ATGCreateIn, new HashMap(), "AdjTransGroup").get("AdjTransGroup"));
    }
  }


/**
 *
 * Sets the AdjTransGroup
 * @param ATGCreateInIn Value of the ATGCreateIn
 *
 */

  public void setAdjTransGroup(ATGObjectData ATGCreateInIn) {
    ATGCreateIn = ATGCreateInIn;
  }

  public void translateFromMap() {
    ATGCreateIn = ATGObjectHelper.fromMap(inputMap, "AdjTransGroup");
  }

/**
 *
 * Gets the AdjTransGroup
 * @return Value of the AdjTransGroup
 *
 */

  public ATGObjectData getAdjTransGroup( ) {
    return ATGCreateIn;
  }

}
