/*
 * Generated code DO NOT EDIT
 * Generated file: NrcTypeGroupFindBulkUdtTemplateItem.java
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
 * Class used to create a NrcTypeGroupFindBulkUdtTemplateItem Bulk Template
 *
 */

public class NrcTypeGroupFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NrcTypeGroupObjectFilter NTGFndIn;
/**
 *
 * Constructor to create a  NrcTypeGroupFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NrcTypeGroupFindBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcTypeGroupObjectFilter NTGFndInIn) {
    super(id, context, "NrcTypeGroupFind");
    NTGFndIn = NTGFndInIn;
  }

  public void translateToMap() {
    if (NTGFndIn != null) {
      Integer index =  NTGFndIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("NrcTypeGroup", NrcTypeGroupObjectHelper.toMap(NTGFndIn, new HashMap(), "NrcTypeGroup").get("NrcTypeGroup"));
    }
  }


/**
 *
 * Sets the NrcTypeGroup
 * @param NTGFndInIn Value of the NTGFndIn
 *
 */

  public void setNrcTypeGroup(NrcTypeGroupObjectFilter NTGFndInIn) {
    NTGFndIn = NTGFndInIn;
  }

  public void translateFromMap() {
    NTGFndIn = NrcTypeGroupObjectHelper.fromMapFilter(inputMap, "NrcTypeGroup");
  }

/**
 *
 * Gets the NrcTypeGroup
 * @return Value of the NrcTypeGroup
 *
 */

  public NrcTypeGroupObjectFilter getNrcTypeGroup( ) {
    return NTGFndIn;
  }

}
