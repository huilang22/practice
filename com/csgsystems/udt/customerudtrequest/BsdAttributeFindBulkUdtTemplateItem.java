/*
 * Generated code DO NOT EDIT
 * Generated file: BsdAttributeFindBulkUdtTemplateItem.java
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
 * Class used to create a BsdAttributeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdAttributeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdAttributeObjectFilter bsdAttributeFindIn;
/**
 *
 * Constructor to create a  BsdAttributeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdAttributeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdAttributeObjectFilter bsdAttributeFindInIn) {
    super(id, context, "BsdAttributeFind");
    bsdAttributeFindIn = bsdAttributeFindInIn;
  }

  public void translateToMap() {
    if (bsdAttributeFindIn != null) {
      Integer index =  bsdAttributeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdAttribute", BsdAttributeObjectHelper.toMap(bsdAttributeFindIn, new HashMap(), "BsdAttribute").get("BsdAttribute"));
    }
  }


/**
 *
 * Sets the BsdAttribute
 * @param bsdAttributeFindInIn Value of the bsdAttributeFindIn
 *
 */

  public void setBsdAttribute(BsdAttributeObjectFilter bsdAttributeFindInIn) {
    bsdAttributeFindIn = bsdAttributeFindInIn;
  }

  public void translateFromMap() {
    bsdAttributeFindIn = BsdAttributeObjectHelper.fromMapFilter(inputMap, "BsdAttribute");
  }

/**
 *
 * Gets the BsdAttribute
 * @return Value of the BsdAttribute
 *
 */

  public BsdAttributeObjectFilter getBsdAttribute( ) {
    return bsdAttributeFindIn;
  }

}
