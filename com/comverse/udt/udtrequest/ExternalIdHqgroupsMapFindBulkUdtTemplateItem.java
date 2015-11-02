/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalIdHqgroupsMapFindBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a ExternalIdHqgroupsMapFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ExternalIdHqgroupsMapFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EIHGMObjectFilter findIn;
/**
 *
 * Constructor to create a  ExternalIdHqgroupsMapFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExternalIdHqgroupsMapFindBulkUdtTemplateItem(String id, BSDMSessionContext context, EIHGMObjectFilter findInIn) {
    super(id, context, "ExternalIdHqgroupsMapFind");
    findIn = findInIn;
  }

  public void translateToMap() {
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ExternalIdHqGroupsMap", EIHGMObjectHelper.toMap(findIn, new HashMap(), "ExternalIdHqGroupsMap").get("ExternalIdHqGroupsMap"));
    }
  }


/**
 *
 * Sets the ExternalIdHqGroupsMap
 * @param findInIn Value of the findIn
 *
 */

  public void setExternalIdHqGroupsMap(EIHGMObjectFilter findInIn) {
    findIn = findInIn;
  }

  public void translateFromMap() {
    findIn = EIHGMObjectHelper.fromMapFilter(inputMap, "ExternalIdHqGroupsMap");
  }

/**
 *
 * Gets the ExternalIdHqGroupsMap
 * @return Value of the ExternalIdHqGroupsMap
 *
 */

  public EIHGMObjectFilter getExternalIdHqGroupsMap( ) {
    return findIn;
  }

}
