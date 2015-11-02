/*
 * Generated code DO NOT EDIT
 * Generated file: NrcGroupFindBulkUdtTemplateItem.java
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
 * Class used to create a NrcGroupFindBulkUdtTemplateItem Bulk Template
 *
 */

public class NrcGroupFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NrcGroupObjectFilter ngFndIn;
/**
 *
 * Constructor to create a  NrcGroupFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NrcGroupFindBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcGroupObjectFilter ngFndInIn) {
    super(id, context, "NrcGroupFind");
    ngFndIn = ngFndInIn;
  }

  public void translateToMap() {
    if (ngFndIn != null) {
      Integer index =  ngFndIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("NrcGroup", NrcGroupObjectHelper.toMap(ngFndIn, new HashMap(), "NrcGroup").get("NrcGroup"));
    }
  }


/**
 *
 * Sets the NrcGroup
 * @param ngFndInIn Value of the ngFndIn
 *
 */

  public void setNrcGroup(NrcGroupObjectFilter ngFndInIn) {
    ngFndIn = ngFndInIn;
  }

  public void translateFromMap() {
    ngFndIn = NrcGroupObjectHelper.fromMapFilter(inputMap, "NrcGroup");
  }

/**
 *
 * Gets the NrcGroup
 * @return Value of the NrcGroup
 *
 */

  public NrcGroupObjectFilter getNrcGroup( ) {
    return ngFndIn;
  }

}
