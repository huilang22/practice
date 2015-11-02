/*
 * Generated code DO NOT EDIT
 * Generated file: BsdBusinessUnitCreateBulkUdtTemplateItem.java
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
 * Class used to create a BsdBusinessUnitCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdBusinessUnitCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdBusinessUnitObjectData bsdBusinessUnitCreateIn;
/**
 *
 * Constructor to create a  BsdBusinessUnitCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdBusinessUnitCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdBusinessUnitObjectData bsdBusinessUnitCreateInIn) {
    super(id, context, "BsdBusinessUnitCreate");
    bsdBusinessUnitCreateIn = bsdBusinessUnitCreateInIn;
  }

  public void translateToMap() {
    if (bsdBusinessUnitCreateIn != null) {
      bsdBusinessUnitCreateIn.resetFlags(true, true);
      addInput("BsdBusinessUnit", BsdBusinessUnitObjectHelper.toMap(bsdBusinessUnitCreateIn, new HashMap(), "BsdBusinessUnit").get("BsdBusinessUnit"));
    }
  }


/**
 *
 * Sets the BsdBusinessUnit
 * @param bsdBusinessUnitCreateInIn Value of the bsdBusinessUnitCreateIn
 *
 */

  public void setBsdBusinessUnit(BsdBusinessUnitObjectData bsdBusinessUnitCreateInIn) {
    bsdBusinessUnitCreateIn = bsdBusinessUnitCreateInIn;
  }

  public void translateFromMap() {
    bsdBusinessUnitCreateIn = BsdBusinessUnitObjectHelper.fromMap(inputMap, "BsdBusinessUnit");
  }

/**
 *
 * Gets the BsdBusinessUnit
 * @return Value of the BsdBusinessUnit
 *
 */

  public BsdBusinessUnitObjectData getBsdBusinessUnit( ) {
    return bsdBusinessUnitCreateIn;
  }

}
