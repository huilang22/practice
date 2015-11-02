/*
 * Generated code DO NOT EDIT
 * Generated file: CitTaskTypeDeleteBulkUdtTemplateItem.java
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
 * Class used to create a CitTaskTypeDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CitTaskTypeDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CitTaskTypeObjectKeyData citTaskTypeDeleteIn;
/**
 *
 * Constructor to create a  CitTaskTypeDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CitTaskTypeDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CitTaskTypeObjectKeyData citTaskTypeDeleteInIn) {
    super(id, context, "CitTaskTypeDelete");
    citTaskTypeDeleteIn = citTaskTypeDeleteInIn;
  }

  public void translateToMap() {
    if (citTaskTypeDeleteIn != null) {
      citTaskTypeDeleteIn.resetFlags(true, true);
      addInput("CitTaskType", CitTaskTypeObjectKeyHelper.toMap(citTaskTypeDeleteIn, new HashMap(), "CitTaskTypeObjectKeyData").get("CitTaskTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the CitTaskType
 * @param citTaskTypeDeleteInIn Value of the citTaskTypeDeleteIn
 *
 */

  public void setCitTaskType(CitTaskTypeObjectKeyData citTaskTypeDeleteInIn) {
    citTaskTypeDeleteIn = citTaskTypeDeleteInIn;
  }

  public void translateFromMap() {
    citTaskTypeDeleteIn = CitTaskTypeObjectKeyHelper.fromMap(inputMap, "CitTaskType");
  }

/**
 *
 * Gets the CitTaskType
 * @return Value of the CitTaskType
 *
 */

  public CitTaskTypeObjectKeyData getCitTaskType( ) {
    return citTaskTypeDeleteIn;
  }

}
