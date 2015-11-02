/*
 * Generated code DO NOT EDIT
 * Generated file: BsdBusinessUnitUpdateBulkUdtTemplateItem.java
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
import com.csgsystems.utl.data.*;

/**
 *
 * Class used to create a BsdBusinessUnitUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdBusinessUnitUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdBusinessUnitObjectData bsdBusinessUnitUpdateIn;
/**
 *
 * Constructor to create a  BsdBusinessUnitUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdBusinessUnitUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdBusinessUnitObjectData bsdBusinessUnitUpdateInIn) {
    super(id, context, "BsdBusinessUnitUpdate");
    bsdBusinessUnitUpdateIn = bsdBusinessUnitUpdateInIn;
  }

  public void translateToMap() {
    if (bsdBusinessUnitUpdateIn != null) {
      bsdBusinessUnitUpdateIn.resetFlags(true, true);
      addInput("BsdBusinessUnit", BsdBusinessUnitObjectHelper.toMap(bsdBusinessUnitUpdateIn, new HashMap(), "BsdBusinessUnit").get("BsdBusinessUnit"));
    }
  }


/**
 *
 * Sets the BsdBusinessUnit
 * @param bsdBusinessUnitUpdateInIn Value of the bsdBusinessUnitUpdateIn
 *
 */

  public void setBsdBusinessUnit(BsdBusinessUnitObjectData bsdBusinessUnitUpdateInIn) {
    bsdBusinessUnitUpdateIn = bsdBusinessUnitUpdateInIn;
  }

  public void translateFromMap() {
    bsdBusinessUnitUpdateIn = BsdBusinessUnitObjectHelper.fromMap(inputMap, "BsdBusinessUnit");
  }

/**
 *
 * Gets the BsdBusinessUnit
 * @return Value of the BsdBusinessUnit
 *
 */

  public BsdBusinessUnitObjectData getBsdBusinessUnit( ) {
    return bsdBusinessUnitUpdateIn;
  }

}
