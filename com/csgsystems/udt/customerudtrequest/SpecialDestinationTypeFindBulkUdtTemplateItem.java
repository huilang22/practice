/*
 * Generated code DO NOT EDIT
 * Generated file: SpecialDestinationTypeFindBulkUdtTemplateItem.java
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
 * Class used to create a SpecialDestinationTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class SpecialDestinationTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SpecialDestinationTypeObjectFilter sdFindIn;
/**
 *
 * Constructor to create a  SpecialDestinationTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SpecialDestinationTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, SpecialDestinationTypeObjectFilter sdFindInIn) {
    super(id, context, "SpecialDestinationTypeFind");
    sdFindIn = sdFindInIn;
  }

  public void translateToMap() {
    if (sdFindIn != null) {
      Integer index =  sdFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("SpecialDestinationType", SpecialDestinationTypeObjectHelper.toMap(sdFindIn, new HashMap(), "SpecialDestinationType").get("SpecialDestinationType"));
    }
  }


/**
 *
 * Sets the SpecialDestinationType
 * @param sdFindInIn Value of the sdFindIn
 *
 */

  public void setSpecialDestinationType(SpecialDestinationTypeObjectFilter sdFindInIn) {
    sdFindIn = sdFindInIn;
  }

  public void translateFromMap() {
    sdFindIn = SpecialDestinationTypeObjectHelper.fromMapFilter(inputMap, "SpecialDestinationType");
  }

/**
 *
 * Gets the SpecialDestinationType
 * @return Value of the SpecialDestinationType
 *
 */

  public SpecialDestinationTypeObjectFilter getSpecialDestinationType( ) {
    return sdFindIn;
  }

}
