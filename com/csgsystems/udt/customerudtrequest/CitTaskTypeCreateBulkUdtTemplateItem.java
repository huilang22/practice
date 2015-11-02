/*
 * Generated code DO NOT EDIT
 * Generated file: CitTaskTypeCreateBulkUdtTemplateItem.java
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
 * Class used to create a CitTaskTypeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CitTaskTypeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CitTaskTypeObjectData citTaskTypeCreateIn;
/**
 *
 * Constructor to create a  CitTaskTypeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CitTaskTypeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CitTaskTypeObjectData citTaskTypeCreateInIn) {
    super(id, context, "CitTaskTypeCreate");
    citTaskTypeCreateIn = citTaskTypeCreateInIn;
  }

  public void translateToMap() {
    if (citTaskTypeCreateIn != null) {
      citTaskTypeCreateIn.resetFlags(true, true);
      addInput("CitTaskType", CitTaskTypeObjectHelper.toMap(citTaskTypeCreateIn, new HashMap(), "CitTaskType").get("CitTaskType"));
    }
  }


/**
 *
 * Sets the CitTaskType
 * @param citTaskTypeCreateInIn Value of the citTaskTypeCreateIn
 *
 */

  public void setCitTaskType(CitTaskTypeObjectData citTaskTypeCreateInIn) {
    citTaskTypeCreateIn = citTaskTypeCreateInIn;
  }

  public void translateFromMap() {
    citTaskTypeCreateIn = CitTaskTypeObjectHelper.fromMap(inputMap, "CitTaskType");
  }

/**
 *
 * Gets the CitTaskType
 * @return Value of the CitTaskType
 *
 */

  public CitTaskTypeObjectData getCitTaskType( ) {
    return citTaskTypeCreateIn;
  }

}
