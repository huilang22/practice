/*
 * Generated code DO NOT EDIT
 * Generated file: BsdAttributeDefaultFindBulkUdtTemplateItem.java
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
 * Class used to create a BsdAttributeDefaultFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdAttributeDefaultFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdAttributeDefaultObjectFilter bsdAttributeDefaultFindIn;
/**
 *
 * Constructor to create a  BsdAttributeDefaultFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdAttributeDefaultFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdAttributeDefaultObjectFilter bsdAttributeDefaultFindInIn) {
    super(id, context, "BsdAttributeDefaultFind");
    bsdAttributeDefaultFindIn = bsdAttributeDefaultFindInIn;
  }

  public void translateToMap() {
    if (bsdAttributeDefaultFindIn != null) {
      Integer index =  bsdAttributeDefaultFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdAttributeDefault", BsdAttributeDefaultObjectHelper.toMap(bsdAttributeDefaultFindIn, new HashMap(), "BsdAttributeDefault").get("BsdAttributeDefault"));
    }
  }


/**
 *
 * Sets the BsdAttributeDefault
 * @param bsdAttributeDefaultFindInIn Value of the bsdAttributeDefaultFindIn
 *
 */

  public void setBsdAttributeDefault(BsdAttributeDefaultObjectFilter bsdAttributeDefaultFindInIn) {
    bsdAttributeDefaultFindIn = bsdAttributeDefaultFindInIn;
  }

  public void translateFromMap() {
    bsdAttributeDefaultFindIn = BsdAttributeDefaultObjectHelper.fromMapFilter(inputMap, "BsdAttributeDefault");
  }

/**
 *
 * Gets the BsdAttributeDefault
 * @return Value of the BsdAttributeDefault
 *
 */

  public BsdAttributeDefaultObjectFilter getBsdAttributeDefault( ) {
    return bsdAttributeDefaultFindIn;
  }

}
