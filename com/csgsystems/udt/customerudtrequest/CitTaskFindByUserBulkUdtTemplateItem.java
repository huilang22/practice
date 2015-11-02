/*
 * Generated code DO NOT EDIT
 * Generated file: CitTaskFindByUserBulkUdtTemplateItem.java
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
 * Class used to create a CitTaskFindByUserBulkUdtTemplateItem Bulk Template
 *
 */

public class CitTaskFindByUserBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CitTaskObjectFilter citTaskFindByUserIn;
  protected String loginId;
/**
 *
 * Constructor to create a  CitTaskFindByUserBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CitTaskFindByUserBulkUdtTemplateItem(String id, BSDMSessionContext context, CitTaskObjectFilter citTaskFindByUserInIn, String loginIdIn) {
    super(id, context, "CitTaskFindByUser");
    citTaskFindByUserIn = citTaskFindByUserInIn;
    loginId = loginIdIn;
  }

  public void translateToMap() {
    if (citTaskFindByUserIn != null) {
      Integer index =  citTaskFindByUserIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CitTask", CitTaskObjectHelper.toMap(citTaskFindByUserIn, new HashMap(), "CitTask").get("CitTask"));
    }
    if (loginId != null) {
      addInput("LoginId", loginId);
    }
  }


/**
 *
 * Sets the CitTask
 * @param citTaskFindByUserInIn Value of the citTaskFindByUserIn
 *
 */

  public void setCitTask(CitTaskObjectFilter citTaskFindByUserInIn) {
    citTaskFindByUserIn = citTaskFindByUserInIn;
  }

/**
 *
 * Sets the LoginId
 * @param loginIdIn Value of the loginId
 *
 */

  public void setLoginId(String loginIdIn) {
    loginId = loginIdIn;
  }

  public void translateFromMap() {
    citTaskFindByUserIn = CitTaskObjectHelper.fromMapFilter(inputMap, "CitTask");
    loginId = (String)inputMap.get("LoginId");
  }

/**
 *
 * Gets the CitTask
 * @return Value of the CitTask
 *
 */

  public CitTaskObjectFilter getCitTask( ) {
    return citTaskFindByUserIn;
  }

/**
 *
 * Gets the LoginId
 * @return Value of the LoginId
 *
 */

  public String getLoginId( ) {
    return loginId;
  }

}
