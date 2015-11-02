/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrProcedureCreateBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a RbrProcedureCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrProcedureCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrProcObjectData RbrProcCreateIn;
/**
 *
 * Constructor to create a  RbrProcedureCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrProcedureCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrProcObjectData RbrProcCreateInIn) {
    super(id, context, "RbrProcedureCreate");
    RbrProcCreateIn = RbrProcCreateInIn;
  }

  public void translateToMap() {
    if (RbrProcCreateIn != null) {
      RbrProcCreateIn.resetFlags(true, true);
      addInput("RbrProcedure", RbrProcObjectHelper.toMap(RbrProcCreateIn, new HashMap(), "RbrProcedure").get("RbrProcedure"));
    }
  }


/**
 *
 * Sets the RbrProcedure
 * @param RbrProcCreateInIn Value of the RbrProcCreateIn
 *
 */

  public void setRbrProcedure(RbrProcObjectData RbrProcCreateInIn) {
    RbrProcCreateIn = RbrProcCreateInIn;
  }

  public void translateFromMap() {
    RbrProcCreateIn = RbrProcObjectHelper.fromMap(inputMap, "RbrProcedure");
  }

/**
 *
 * Gets the RbrProcedure
 * @return Value of the RbrProcedure
 *
 */

  public RbrProcObjectData getRbrProcedure( ) {
    return RbrProcCreateIn;
  }

}
