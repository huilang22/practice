/*
 * Generated code DO NOT EDIT
 * Generated file: CitTaskFindForInvalidUserBulkUdtTemplateItem.java
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
 * Class used to create a CitTaskFindForInvalidUserBulkUdtTemplateItem Bulk Template
 *
 */

public class CitTaskFindForInvalidUserBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CitTaskObjectFilter citTaskFindForInvalidUserIn;
/**
 *
 * Constructor to create a  CitTaskFindForInvalidUserBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CitTaskFindForInvalidUserBulkUdtTemplateItem(String id, BSDMSessionContext context, CitTaskObjectFilter citTaskFindForInvalidUserInIn) {
    super(id, context, "CitTaskFindForInvalidUser");
    citTaskFindForInvalidUserIn = citTaskFindForInvalidUserInIn;
  }

  public void translateToMap() {
    if (citTaskFindForInvalidUserIn != null) {
      Integer index =  citTaskFindForInvalidUserIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CitTask", CitTaskObjectHelper.toMap(citTaskFindForInvalidUserIn, new HashMap(), "CitTask").get("CitTask"));
    }
  }


/**
 *
 * Sets the CitTask
 * @param citTaskFindForInvalidUserInIn Value of the citTaskFindForInvalidUserIn
 *
 */

  public void setCitTask(CitTaskObjectFilter citTaskFindForInvalidUserInIn) {
    citTaskFindForInvalidUserIn = citTaskFindForInvalidUserInIn;
  }

  public void translateFromMap() {
    citTaskFindForInvalidUserIn = CitTaskObjectHelper.fromMapFilter(inputMap, "CitTask");
  }

/**
 *
 * Gets the CitTask
 * @return Value of the CitTask
 *
 */

  public CitTaskObjectFilter getCitTask( ) {
    return citTaskFindForInvalidUserIn;
  }

}
