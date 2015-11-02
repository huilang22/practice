/*
 * Generated code DO NOT EDIT
 * Generated file: CitTaskTypeUpdateBulkUdtTemplateItem.java
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
 * Class used to create a CitTaskTypeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CitTaskTypeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CitTaskTypeObjectData citTaskTypeUpdateIn;
/**
 *
 * Constructor to create a  CitTaskTypeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CitTaskTypeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CitTaskTypeObjectData citTaskTypeUpdateInIn) {
    super(id, context, "CitTaskTypeUpdate");
    citTaskTypeUpdateIn = citTaskTypeUpdateInIn;
  }

  public void translateToMap() {
    if (citTaskTypeUpdateIn != null) {
      citTaskTypeUpdateIn.resetFlags(true, true);
      addInput("CitTaskType", CitTaskTypeObjectHelper.toMap(citTaskTypeUpdateIn, new HashMap(), "CitTaskType").get("CitTaskType"));
    }
  }


/**
 *
 * Sets the CitTaskType
 * @param citTaskTypeUpdateInIn Value of the citTaskTypeUpdateIn
 *
 */

  public void setCitTaskType(CitTaskTypeObjectData citTaskTypeUpdateInIn) {
    citTaskTypeUpdateIn = citTaskTypeUpdateInIn;
  }

  public void translateFromMap() {
    citTaskTypeUpdateIn = CitTaskTypeObjectHelper.fromMap(inputMap, "CitTaskType");
  }

/**
 *
 * Gets the CitTaskType
 * @return Value of the CitTaskType
 *
 */

  public CitTaskTypeObjectData getCitTaskType( ) {
    return citTaskTypeUpdateIn;
  }

}
