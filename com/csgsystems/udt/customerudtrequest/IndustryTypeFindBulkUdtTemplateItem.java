/*
 * Generated code DO NOT EDIT
 * Generated file: IndustryTypeFindBulkUdtTemplateItem.java
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
 * Class used to create a IndustryTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class IndustryTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected IndustryTypeObjectFilter ITFindIn;
/**
 *
 * Constructor to create a  IndustryTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public IndustryTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, IndustryTypeObjectFilter ITFindInIn) {
    super(id, context, "IndustryTypeFind");
    ITFindIn = ITFindInIn;
  }

  public void translateToMap() {
    if (ITFindIn != null) {
      Integer index =  ITFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("IndustryType", IndustryTypeObjectHelper.toMap(ITFindIn, new HashMap(), "IndustryType").get("IndustryType"));
    }
  }


/**
 *
 * Sets the IndustryType
 * @param ITFindInIn Value of the ITFindIn
 *
 */

  public void setIndustryType(IndustryTypeObjectFilter ITFindInIn) {
    ITFindIn = ITFindInIn;
  }

  public void translateFromMap() {
    ITFindIn = IndustryTypeObjectHelper.fromMapFilter(inputMap, "IndustryType");
  }

/**
 *
 * Gets the IndustryType
 * @return Value of the IndustryType
 *
 */

  public IndustryTypeObjectFilter getIndustryType( ) {
    return ITFindIn;
  }

}
