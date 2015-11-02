/*
 * Generated code DO NOT EDIT
 * Generated file: BsdApplicationDefaultFindBulkUdtTemplateItem.java
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
 * Class used to create a BsdApplicationDefaultFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdApplicationDefaultFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdApplicationDefaultObjectFilter bsdApplicationDefaultFindIn;
/**
 *
 * Constructor to create a  BsdApplicationDefaultFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdApplicationDefaultFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdApplicationDefaultObjectFilter bsdApplicationDefaultFindInIn) {
    super(id, context, "BsdApplicationDefaultFind");
    bsdApplicationDefaultFindIn = bsdApplicationDefaultFindInIn;
  }

  public void translateToMap() {
    if (bsdApplicationDefaultFindIn != null) {
      Integer index =  bsdApplicationDefaultFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdApplicationDefault", BsdApplicationDefaultObjectHelper.toMap(bsdApplicationDefaultFindIn, new HashMap(), "BsdApplicationDefault").get("BsdApplicationDefault"));
    }
  }


/**
 *
 * Sets the BsdApplicationDefault
 * @param bsdApplicationDefaultFindInIn Value of the bsdApplicationDefaultFindIn
 *
 */

  public void setBsdApplicationDefault(BsdApplicationDefaultObjectFilter bsdApplicationDefaultFindInIn) {
    bsdApplicationDefaultFindIn = bsdApplicationDefaultFindInIn;
  }

  public void translateFromMap() {
    bsdApplicationDefaultFindIn = BsdApplicationDefaultObjectHelper.fromMapFilter(inputMap, "BsdApplicationDefault");
  }

/**
 *
 * Gets the BsdApplicationDefault
 * @return Value of the BsdApplicationDefault
 *
 */

  public BsdApplicationDefaultObjectFilter getBsdApplicationDefault( ) {
    return bsdApplicationDefaultFindIn;
  }

}
