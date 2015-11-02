/*
 * Generated code DO NOT EDIT
 * Generated file: BsdRelationalDefaultUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BsdRelationalDefaultUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdRelationalDefaultUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdRelationalDefaultObjectBaseData bsdRelationalDefaultUpdateIn;
/**
 *
 * Constructor to create a  BsdRelationalDefaultUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdRelationalDefaultUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdRelationalDefaultObjectBaseData bsdRelationalDefaultUpdateInIn) {
    super(id, context, "BsdRelationalDefaultUpdate");
    bsdRelationalDefaultUpdateIn = bsdRelationalDefaultUpdateInIn;
  }

  public void translateToMap() {
    if (bsdRelationalDefaultUpdateIn != null) {
      bsdRelationalDefaultUpdateIn.resetFlags(true, true);
      addInput("BsdRelationalDefault", BsdRelationalDefaultObjectBaseHelper.toMap(bsdRelationalDefaultUpdateIn, new HashMap(), "BsdRelationalDefault").get("BsdRelationalDefault"));
    }
  }


/**
 *
 * Sets the BsdRelationalDefault
 * @param bsdRelationalDefaultUpdateInIn Value of the bsdRelationalDefaultUpdateIn
 *
 */

  public void setBsdRelationalDefault(BsdRelationalDefaultObjectBaseData bsdRelationalDefaultUpdateInIn) {
    bsdRelationalDefaultUpdateIn = bsdRelationalDefaultUpdateInIn;
  }

  public void translateFromMap() {
    bsdRelationalDefaultUpdateIn = BsdRelationalDefaultObjectBaseHelper.fromMap(inputMap, "BsdRelationalDefault");
  }

/**
 *
 * Gets the BsdRelationalDefault
 * @return Value of the BsdRelationalDefault
 *
 */

  public BsdRelationalDefaultObjectBaseData getBsdRelationalDefault( ) {
    return bsdRelationalDefaultUpdateIn;
  }

}
