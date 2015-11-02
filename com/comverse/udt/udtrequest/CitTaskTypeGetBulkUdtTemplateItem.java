/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskTypeGetBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a CitTaskTypeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CitTaskTypeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CitTaskTypeObjectKeyData citTaskTypeGetIn;
/**
 *
 * Constructor to create a  CitTaskTypeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CitTaskTypeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CitTaskTypeObjectKeyData citTaskTypeGetInIn) {
    super(id, context, "CitTaskTypeGet");
    citTaskTypeGetIn = citTaskTypeGetInIn;
  }

  public void translateToMap() {
    if (citTaskTypeGetIn != null) {
      citTaskTypeGetIn.resetFlags(true, true);
      addInput("CitTaskType", CitTaskTypeObjectKeyHelper.toMap(citTaskTypeGetIn, new HashMap(), "CitTaskTypeObjectKeyData").get("CitTaskTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the CitTaskType
 * @param citTaskTypeGetInIn Value of the citTaskTypeGetIn
 *
 */

  public void setCitTaskType(CitTaskTypeObjectKeyData citTaskTypeGetInIn) {
    citTaskTypeGetIn = citTaskTypeGetInIn;
  }

  public void translateFromMap() {
    citTaskTypeGetIn = CitTaskTypeObjectKeyHelper.fromMap(inputMap, "CitTaskType");
  }

/**
 *
 * Gets the CitTaskType
 * @return Value of the CitTaskType
 *
 */

  public CitTaskTypeObjectKeyData getCitTaskType( ) {
    return citTaskTypeGetIn;
  }

}
