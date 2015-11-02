/*
 * Generated code DO NOT EDIT
 * Generated file: EmfConfigIdFindBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a EmfConfigIdFindBulkUdtTemplateItem Bulk Template
 *
 */

public class EmfConfigIdFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ECIObjectFilter ECIFindIn;
/**
 *
 * Constructor to create a  EmfConfigIdFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EmfConfigIdFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ECIObjectFilter ECIFindInIn) {
    super(id, context, "EmfConfigIdFind");
    ECIFindIn = ECIFindInIn;
  }

  public void translateToMap() {
    if (ECIFindIn != null) {
      Integer index =  ECIFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("EmfConfigId", ECIObjectHelper.toMap(ECIFindIn, new HashMap(), "EmfConfigId").get("EmfConfigId"));
    }
  }


/**
 *
 * Sets the EmfConfigId
 * @param ECIFindInIn Value of the ECIFindIn
 *
 */

  public void setEmfConfigId(ECIObjectFilter ECIFindInIn) {
    ECIFindIn = ECIFindInIn;
  }

  public void translateFromMap() {
    ECIFindIn = ECIObjectHelper.fromMapFilter(inputMap, "EmfConfigId");
  }

/**
 *
 * Gets the EmfConfigId
 * @return Value of the EmfConfigId
 *
 */

  public ECIObjectFilter getEmfConfigId( ) {
    return ECIFindIn;
  }

}
