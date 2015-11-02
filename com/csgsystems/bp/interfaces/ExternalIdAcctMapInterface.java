
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
public interface ExternalIdAcctMapInterface extends BaliInterface {

  /**
   * Get a unique ExternalIdAcctMap row..
   * Convenience method using default BSDMSessionContext.
   * @param getIn Input Object Key.
   * @return EIAMObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EIAMObjectData get (EIAMObjectKeyData getIn) throws BSDMResourceException;
  /**
   * Get a unique ExternalIdAcctMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param getIn Input Object Key.
   * @return EIAMObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EIAMObjectData get (BSDMSessionContext context, EIAMObjectKeyData getIn) throws BSDMResourceException;


  /**
   * Get a unique ExternalIdAcctMap row..
   * Convenience method using default BSDMSessionContext.
   * @param getIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EIAMObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public EIAMObjectData get (EIAMObjectKeyData getIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a unique ExternalIdAcctMap row..
   * @param context The session context to use when connecting to the APITS server.
   * @param getIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EIAMObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public EIAMObjectData get (BSDMSessionContext context, EIAMObjectKeyData getIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find ExternalIdAcctMap's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param findIn Input Filter Object.
   * @return EIAMObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EIAMObjectDataList find (EIAMObjectFilter findIn) throws BSDMResourceException;
  /**
   * Find ExternalIdAcctMap's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param findIn Input Filter Object.
   * @return EIAMObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public EIAMObjectDataList find (BSDMSessionContext context, EIAMObjectFilter findIn) throws BSDMResourceException;


  /**
   * Find ExternalIdAcctMap's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param findIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EIAMObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public EIAMObjectDataList find (EIAMObjectFilter findIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find ExternalIdAcctMap's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param findIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return EIAMObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public EIAMObjectDataList find (BSDMSessionContext context, EIAMObjectFilter findIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
