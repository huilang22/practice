/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EntityTypeGroupMemberFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a EntityTypeGroupMemberFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class EntityTypeGroupMemberFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected EntityTypeGroupMemberObjectDataList noOpIn;

/**
 *
 * Constructor to create a   EntityTypeGroupMemberFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public EntityTypeGroupMemberFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, EntityTypeGroupMemberObjectDataList noOpInIn) {
    super(id, context, "EntityTypeGroupMemberFind");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
          noOpIn.getArray()[i].resetFlags(true, true);
        mapArray[i] = EntityTypeGroupMemberObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("EntityTypeGroupMember", noOpIn);
      }
      addInput("EntityTypeGroupMember", mapList);
    }
  }
/**
 *
 * Sets the  EntityTypeGroupMember
 * @param noOpInIn EntityTypeGroupMemberObjectDataList to set
 *
 */
  public void setEntityTypeGroupMember(EntityTypeGroupMemberObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the EntityTypeGroupMember passed into the constructor
 * @return Simulated response
 *
 */
  public EntityTypeGroupMemberObjectDataList getEntityTypeGroupMember() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = EntityTypeGroupMemberObjectHelper.fromMapList(inputMap, "EntityTypeGroupMemberList");
  }
}
