/*
 * Generated code DO NOT EDIT
 * Generated file: ExternalIdAcctMapFindBulkUdtTemplateItem.java
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
 * Class used to create a ExternalIdAcctMapFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ExternalIdAcctMapFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EIAMObjectFilter findIn;
/**
 *
 * Constructor to create a  ExternalIdAcctMapFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExternalIdAcctMapFindBulkUdtTemplateItem(String id, BSDMSessionContext context, EIAMObjectFilter findInIn) {
    super(id, context, "ExternalIdAcctMapFind");
    findIn = findInIn;
  }

  public void translateToMap() {
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ExternalIdAcctMap", EIAMObjectHelper.toMap(findIn, new HashMap(), "ExternalIdAcctMap").get("ExternalIdAcctMap"));
    }
  }


/**
 *
 * Sets the ExternalIdAcctMap
 * @param findInIn Value of the findIn
 *
 */

  public void setExternalIdAcctMap(EIAMObjectFilter findInIn) {
    findIn = findInIn;
  }

  public void translateFromMap() {
    findIn = EIAMObjectHelper.fromMapFilter(inputMap, "ExternalIdAcctMap");
  }

/**
 *
 * Gets the ExternalIdAcctMap
 * @return Value of the ExternalIdAcctMap
 *
 */

  public EIAMObjectFilter getExternalIdAcctMap( ) {
    return findIn;
  }

}
