/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WorkpointUpdateBulkUdtTemplateItem.java
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
import com.csgsystems.wp.data.*;

/**
 *
 * Class used to create a WorkpointUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class WorkpointUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected WorkpointObjectData _WorkpointUpdate;
/**
 *
 * Constructor to create a  WorkpointUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public WorkpointUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, WorkpointObjectData _WorkpointUpdateIn) {
    super(id, context, "WorkpointUpdate");
    _WorkpointUpdate = _WorkpointUpdateIn;
  }

  public void translateToMap() {
    if (_WorkpointUpdate != null) {
      _WorkpointUpdate.resetFlags(true, true);
      addInput("WorkpointUpdate", WorkpointObjectHelper.toMap(_WorkpointUpdate, new HashMap(), "Void").get("Void"));
    }
  }


/**
 *
 * Sets the WorkpointUpdate
 * @param _WorkpointUpdateIn Value of the _WorkpointUpdate
 *
 */

  public void setWorkpointUpdate(WorkpointObjectData _WorkpointUpdateIn) {
    _WorkpointUpdate = _WorkpointUpdateIn;
  }

  public void translateFromMap() {
    _WorkpointUpdate = WorkpointObjectHelper.fromMap(inputMap, "WorkpointUpdate");
  }

/**
 *
 * Gets the WorkpointUpdate
 * @return Value of the WorkpointUpdate
 *
 */

  public WorkpointObjectData getWorkpointUpdate( ) {
    return _WorkpointUpdate;
  }

}
