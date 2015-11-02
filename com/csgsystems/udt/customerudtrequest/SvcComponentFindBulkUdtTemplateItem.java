/*
 * Generated code DO NOT EDIT
 * Generated file: SvcComponentFindBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a SvcComponentFindBulkUdtTemplateItem Bulk Template
 *
 */

public class SvcComponentFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SvcComponentObjectFilter SvcComponentFindIn;
/**
 *
 * Constructor to create a  SvcComponentFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SvcComponentFindBulkUdtTemplateItem(String id, BSDMSessionContext context, SvcComponentObjectFilter SvcComponentFindInIn) {
    super(id, context, "SvcComponentFind");
    SvcComponentFindIn = SvcComponentFindInIn;
  }

  public void translateToMap() {
    if (SvcComponentFindIn != null) {
      Integer index =  SvcComponentFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("SvcComponent", SvcComponentObjectHelper.toMap(SvcComponentFindIn, new HashMap(), "SvcComponent").get("SvcComponent"));
    }
  }


/**
 *
 * Sets the SvcComponent
 * @param SvcComponentFindInIn Value of the SvcComponentFindIn
 *
 */

  public void setSvcComponent(SvcComponentObjectFilter SvcComponentFindInIn) {
    SvcComponentFindIn = SvcComponentFindInIn;
  }

  public void translateFromMap() {
    SvcComponentFindIn = SvcComponentObjectHelper.fromMapFilter(inputMap, "SvcComponent");
  }

/**
 *
 * Gets the SvcComponent
 * @return Value of the SvcComponent
 *
 */

  public SvcComponentObjectFilter getSvcComponent( ) {
    return SvcComponentFindIn;
  }

}
