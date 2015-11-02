/*
 * Generated code DO NOT EDIT
 * Generated file: BsdRelationalDefaultCreateBulkUdtTemplateItem.java
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
 * Class used to create a BsdRelationalDefaultCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdRelationalDefaultCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdRelationalDefaultObjectBaseData bsdRelationalDefaultCreateIn;
/**
 *
 * Constructor to create a  BsdRelationalDefaultCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdRelationalDefaultCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdRelationalDefaultObjectBaseData bsdRelationalDefaultCreateInIn) {
    super(id, context, "BsdRelationalDefaultCreate");
    bsdRelationalDefaultCreateIn = bsdRelationalDefaultCreateInIn;
  }

  public void translateToMap() {
    if (bsdRelationalDefaultCreateIn != null) {
      bsdRelationalDefaultCreateIn.resetFlags(true, true);
      addInput("BsdRelationalDefault", BsdRelationalDefaultObjectBaseHelper.toMap(bsdRelationalDefaultCreateIn, new HashMap(), "BsdRelationalDefault").get("BsdRelationalDefault"));
    }
  }


/**
 *
 * Sets the BsdRelationalDefault
 * @param bsdRelationalDefaultCreateInIn Value of the bsdRelationalDefaultCreateIn
 *
 */

  public void setBsdRelationalDefault(BsdRelationalDefaultObjectBaseData bsdRelationalDefaultCreateInIn) {
    bsdRelationalDefaultCreateIn = bsdRelationalDefaultCreateInIn;
  }

  public void translateFromMap() {
    bsdRelationalDefaultCreateIn = BsdRelationalDefaultObjectBaseHelper.fromMap(inputMap, "BsdRelationalDefault");
  }

/**
 *
 * Gets the BsdRelationalDefault
 * @return Value of the BsdRelationalDefault
 *
 */

  public BsdRelationalDefaultObjectBaseData getBsdRelationalDefault( ) {
    return bsdRelationalDefaultCreateIn;
  }

}
