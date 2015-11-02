
package com.csgsystems.bp.interfaces;

import java.io.*;
import java.math.*;
import java.util.*;

import javax.ejb.Remote;

import com.csgsystems.bali.BaliInterface;

import com.csgsystems.aruba.connection.BSDMResourceException;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.constraint.ConstraintException;


import com.csgsystems.bp.data.*;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 */
@Remote
public interface ExternalIdHqGroupsMapInterface extends BaliInterface {

  /**
   * Get a unique ExternalIdHqGroupsMap row..
   * Convenience method using default BSDMSessionContext.
   * @param getIn Input Object Key.
   * @return EIHGMObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EIHGMObjectData externalIdHqgroupsMapGet (EIHGMObjectKeyData getIn) throws BSDMResourceException;
  /**
   * Get a unique ExternalIdHqGroupsMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param getIn Input Object Key.
   * @return EIHGMObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EIHGMObjectData externalIdHqgroupsMapGet (BSDMSessionContext context, EIHGMObjectKeyData getIn) throws BSDMResourceException;


  /**
   * Get a unique ExternalIdHqGroupsMap row..
   * Convenience method using default BSDMSessionContext.
   * @param getIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EIHGMObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public EIHGMObjectData externalIdHqgroupsMapGet (EIHGMObjectKeyData getIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique ExternalIdHqGroupsMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param getIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EIHGMObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public EIHGMObjectData externalIdHqgroupsMapGet (BSDMSessionContext context, EIHGMObjectKeyData getIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find ExternalIdHqGroupsMap's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param findIn Input Filter Object.
   * @return EIHGMObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EIHGMObjectDataList externalIdHqgroupsMapFind (EIHGMObjectFilter findIn) throws BSDMResourceException;
  /**
   * Find ExternalIdHqGroupsMap's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param findIn Input Filter Object.
   * @return EIHGMObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EIHGMObjectDataList externalIdHqgroupsMapFind (BSDMSessionContext context, EIHGMObjectFilter findIn) throws BSDMResourceException;


  /**
   * Find ExternalIdHqGroupsMap's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param findIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EIHGMObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public EIHGMObjectDataList externalIdHqgroupsMapFind (EIHGMObjectFilter findIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find ExternalIdHqGroupsMap's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param findIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EIHGMObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public EIHGMObjectDataList externalIdHqgroupsMapFind (BSDMSessionContext context, EIHGMObjectFilter findIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
