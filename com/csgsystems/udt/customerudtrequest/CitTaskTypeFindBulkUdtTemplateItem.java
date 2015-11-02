/*
 * Generated code DO NOT EDIT
 * Generated file: CitTaskTypeFindBulkUdtTemplateItem.java
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
import com.csgsystems.cit.data.*;

/**
 *
 * Class used to create a CitTaskTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CitTaskTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CitTaskTypeObjectFilter citTaskTypeFindIn;
/**
 *
 * Constructor to create a  CitTaskTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CitTaskTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CitTaskTypeObjectFilter citTaskTypeFindInIn) {
    super(id, context, "CitTaskTypeFind");
    citTaskTypeFindIn = citTaskTypeFindInIn;
  }

  public void translateToMap() {
    if (citTaskTypeFindIn != null) {
      Integer index =  citTaskTypeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CitTaskType", CitTaskTypeObjectHelper.toMap(citTaskTypeFindIn, new HashMap(), "CitTaskType").get("CitTaskType"));
    }
  }


/**
 *
 * Sets the CitTaskType
 * @param citTaskTypeFindInIn Value of the citTaskTypeFindIn
 *
 */

  public void setCitTaskType(CitTaskTypeObjectFilter citTaskTypeFindInIn) {
    citTaskTypeFindIn = citTaskTypeFindInIn;
  }

  public void translateFromMap() {
    citTaskTypeFindIn = CitTaskTypeObjectHelper.fromMapFilter(inputMap, "CitTaskType");
  }

/**
 *
 * Gets the CitTaskType
 * @return Value of the CitTaskType
 *
 */

  public CitTaskTypeObjectFilter getCitTaskType( ) {
    return citTaskTypeFindIn;
  }

}
