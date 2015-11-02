/*
 * Generated code DO NOT EDIT
 * Generated file: GlobalContractFindBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a GlobalContractFindBulkUdtTemplateItem Bulk Template
 *
 */

public class GlobalContractFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GlobalContractObjectFilter GlobalContractFindIn;
/**
 *
 * Constructor to create a  GlobalContractFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GlobalContractFindBulkUdtTemplateItem(String id, BSDMSessionContext context, GlobalContractObjectFilter GlobalContractFindInIn) {
    super(id, context, "GlobalContractFind");
    GlobalContractFindIn = GlobalContractFindInIn;
  }

  public void translateToMap() {
    if (GlobalContractFindIn != null) {
      Integer index =  GlobalContractFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("GlobalContract", GlobalContractObjectHelper.toMap(GlobalContractFindIn, new HashMap(), "GlobalContract").get("GlobalContract"));
    }
  }


/**
 *
 * Sets the GlobalContract
 * @param GlobalContractFindInIn Value of the GlobalContractFindIn
 *
 */

  public void setGlobalContract(GlobalContractObjectFilter GlobalContractFindInIn) {
    GlobalContractFindIn = GlobalContractFindInIn;
  }

  public void translateFromMap() {
    GlobalContractFindIn = GlobalContractObjectHelper.fromMapFilter(inputMap, "GlobalContract");
  }

/**
 *
 * Gets the GlobalContract
 * @return Value of the GlobalContract
 *
 */

  public GlobalContractObjectFilter getGlobalContract( ) {
    return GlobalContractFindIn;
  }

}
