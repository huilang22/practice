/*
 * Generated code DO NOT EDIT
 * Generated file: LateFeeTypesFindBulkUdtTemplateItem.java
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
 * Class used to create a LateFeeTypesFindBulkUdtTemplateItem Bulk Template
 *
 */

public class LateFeeTypesFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected LFTObjectFilter LFTFindIn;
/**
 *
 * Constructor to create a  LateFeeTypesFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public LateFeeTypesFindBulkUdtTemplateItem(String id, BSDMSessionContext context, LFTObjectFilter LFTFindInIn) {
    super(id, context, "LateFeeTypesFind");
    LFTFindIn = LFTFindInIn;
  }

  public void translateToMap() {
    if (LFTFindIn != null) {
      Integer index =  LFTFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("LateFeeTypes", LFTObjectHelper.toMap(LFTFindIn, new HashMap(), "LateFeeTypes").get("LateFeeTypes"));
    }
  }


/**
 *
 * Sets the LateFeeTypes
 * @param LFTFindInIn Value of the LFTFindIn
 *
 */

  public void setLateFeeTypes(LFTObjectFilter LFTFindInIn) {
    LFTFindIn = LFTFindInIn;
  }

  public void translateFromMap() {
    LFTFindIn = LFTObjectHelper.fromMapFilter(inputMap, "LateFeeTypes");
  }

/**
 *
 * Gets the LateFeeTypes
 * @return Value of the LateFeeTypes
 *
 */

  public LFTObjectFilter getLateFeeTypes( ) {
    return LFTFindIn;
  }

}
