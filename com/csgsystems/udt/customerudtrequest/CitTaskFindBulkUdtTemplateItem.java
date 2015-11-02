/*
 * Generated code DO NOT EDIT
 * Generated file: CitTaskFindBulkUdtTemplateItem.java
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
 * Class used to create a CitTaskFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CitTaskFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CitTaskObjectFilter citTaskFindIn;
/**
 *
 * Constructor to create a  CitTaskFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CitTaskFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CitTaskObjectFilter citTaskFindInIn) {
    super(id, context, "CitTaskFind");
    citTaskFindIn = citTaskFindInIn;
  }

  public void translateToMap() {
    if (citTaskFindIn != null) {
      Integer index =  citTaskFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CitTask", CitTaskObjectHelper.toMap(citTaskFindIn, new HashMap(), "CitTask").get("CitTask"));
    }
  }


/**
 *
 * Sets the CitTask
 * @param citTaskFindInIn Value of the citTaskFindIn
 *
 */

  public void setCitTask(CitTaskObjectFilter citTaskFindInIn) {
    citTaskFindIn = citTaskFindInIn;
  }

  public void translateFromMap() {
    citTaskFindIn = CitTaskObjectHelper.fromMapFilter(inputMap, "CitTask");
  }

/**
 *
 * Gets the CitTask
 * @return Value of the CitTask
 *
 */

  public CitTaskObjectFilter getCitTask( ) {
    return citTaskFindIn;
  }

}
