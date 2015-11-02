/*
 * Generated code DO NOT EDIT
 * Generated file: BillModeOverrideCreateBulkUdtTemplateItem.java
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
 * Class used to create a BillModeOverrideCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BillModeOverrideCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BMOObjectData BMOCreateIn;
/**
 *
 * Constructor to create a  BillModeOverrideCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillModeOverrideCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BMOObjectData BMOCreateInIn) {
    super(id, context, "BillModeOverrideCreate");
    BMOCreateIn = BMOCreateInIn;
  }

  public void translateToMap() {
    if (BMOCreateIn != null) {
      BMOCreateIn.resetFlags(true, true);
      addInput("BillModeOverride", BMOObjectHelper.toMap(BMOCreateIn, new HashMap(), "BillModeOverride").get("BillModeOverride"));
    }
  }


/**
 *
 * Sets the BillModeOverride
 * @param BMOCreateInIn Value of the BMOCreateIn
 *
 */

  public void setBillModeOverride(BMOObjectData BMOCreateInIn) {
    BMOCreateIn = BMOCreateInIn;
  }

  public void translateFromMap() {
    BMOCreateIn = BMOObjectHelper.fromMap(inputMap, "BillModeOverride");
  }

/**
 *
 * Gets the BillModeOverride
 * @return Value of the BillModeOverride
 *
 */

  public BMOObjectData getBillModeOverride( ) {
    return BMOCreateIn;
  }

}
