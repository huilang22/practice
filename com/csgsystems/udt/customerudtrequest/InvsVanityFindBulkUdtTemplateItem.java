/*
 * Generated code DO NOT EDIT
 * Generated file: InvsVanityFindBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvsVanityFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsVanityFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsVanityObjectFilter InvsVanityFindIn;
/**
 *
 * Constructor to create a  InvsVanityFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsVanityFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsVanityObjectFilter InvsVanityFindInIn) {
    super(id, context, "InvsVanityFind");
    InvsVanityFindIn = InvsVanityFindInIn;
  }

  public void translateToMap() {
    if (InvsVanityFindIn != null) {
      Integer index =  InvsVanityFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsVanity", InvsVanityObjectHelper.toMap(InvsVanityFindIn, new HashMap(), "InvsVanity").get("InvsVanity"));
    }
  }


/**
 *
 * Sets the InvsVanity
 * @param InvsVanityFindInIn Value of the InvsVanityFindIn
 *
 */

  public void setInvsVanity(InvsVanityObjectFilter InvsVanityFindInIn) {
    InvsVanityFindIn = InvsVanityFindInIn;
  }

  public void translateFromMap() {
    InvsVanityFindIn = InvsVanityObjectHelper.fromMapFilter(inputMap, "InvsVanity");
  }

/**
 *
 * Gets the InvsVanity
 * @return Value of the InvsVanity
 *
 */

  public InvsVanityObjectFilter getInvsVanity( ) {
    return InvsVanityFindIn;
  }

}
